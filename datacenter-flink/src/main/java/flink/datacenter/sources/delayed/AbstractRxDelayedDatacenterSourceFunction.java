package flink.datacenter.sources.delayed;

import java.util.concurrent.TimeUnit;

import flink.datacenter.pojos.Task;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;

public abstract class AbstractRxDelayedDatacenterSourceFunction extends AbstractDelayedDatacenterSourceFunction {
	
		public AbstractRxDelayedDatacenterSourceFunction(String filePath) {
			super(filePath);
		}

		/**
		 * 
		 */
		protected static final long serialVersionUID = 1L;
		
		/**
		 * 
		 */
		protected CompositeDisposable disposables;
		
		/**
		 * @return
		 */
		public CompositeDisposable getDisposables() {
			return disposables;
		}
		
		/**
		 * @param disposables
		 */
		public void setDisposables(CompositeDisposable disposables) {
			this.disposables = disposables;
		}

		/* (non-Javadoc)
		 * @see org.apache.flink.streaming.api.functions.source.SourceFunction#run(org.apache.flink.streaming.api.functions.source.SourceFunction.SourceContext)
		 */
		@Override
		public void run( SourceContext<Task> ctx)
				throws Exception {
			 disposables = new CompositeDisposable();	
			 Observable.fromIterable(iterable())
			 		   .concatMap( t -> Observable.just(t) 
   		 										  .delay(delay().toMillis(), 
   		 												  TimeUnit.MILLISECONDS))
			 		  .doOnSubscribe(disposable -> disposables.add(disposable))
					  .blockingSubscribe(event -> ctx.collect(event));			 
		}
		
		/* (non-Javadoc)
		 * @see org.apache.flink.streaming.api.functions.source.SourceFunction#cancel()
		 */
		@Override
		public void cancel() {
			 if(disposables != null) {
			     disposables.clear();
			 }
		}
		
				
}
