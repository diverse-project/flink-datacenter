package flink.datacenter.pojos;

public class Task {

		private Job parentJob;
		
		private Machine hostMachine;
	
		private long taskIndex;
		
		private  long startTime;
		
		private  long endTime;
		
		private float CPURate;
		
		private float canonicalMemUsage;
		
		private float assignedMemUsage;
		
		private float unmappedCache;
		 
		private float totalPageCache;
		
		private float maxMemoryUsage;
		
		private float IOTime;
		
		private float localDiskUsage;
		
		private float maxCPURate;	
		
		private float maxDiskIOTime;
		
		private float cyclesPerInstruction;
		
		private float memoryAccessPerInstruction;
		
		private float samplePortion;
		
		private boolean aggregationType;
		
		private float sampledCPUUsage;
		
		/**
		 * @return the _id
		 */
		public long get_id() {
			return taskIndex;
		}

		/**
		 * @param _id the _id to set
		 */
		public void set_id(long _id) {
			this.taskIndex = _id;
		}

		/**
		 * @return the parentJob
		 */
		public Job getParentJob() {
			return parentJob;
		}

		/**
		 * @param parentJob the parentJob to set
		 */
		public void setParentJob(Job parentJob) {
			this.parentJob = parentJob;
		}

		/**
		 * @return the startTime
		 */
		public long getStartTime() {
			return startTime;
		}

		/**
		 * @param startTime the startTime to set
		 */
		public void setStartTime(long startTime) {
			this.startTime = startTime;
		}

		/**
		 * @return the endTime
		 */
		public long getEndTime() {
			return endTime;
		}

		/**
		 * @param endTime the endTime to set
		 */
		public void setEndTime(long endTime) {
			this.endTime = endTime;
		}

		/**
		 * @return the cPURate
		 */
		public float getCPURate() {
			return CPURate;
		}

		/**
		 * @param cPURate the cPURate to set
		 */
		public void setCPURate(float cPURate) {
			CPURate = cPURate;
		}

		/**
		 * @return the canonicalMemUsage
		 */
		public float getCanonicalMemUsage() {
			return canonicalMemUsage;
		}

		/**
		 * @param canonicalMemUsage the canonicalMemUsage to set
		 */
		public void setCanonicalMemUsage(float canonicalMemUsage) {
			this.canonicalMemUsage = canonicalMemUsage;
		}

		/**
		 * @return the assignedMemUsage
		 */
		public float getAssignedMemUsage() {
			return assignedMemUsage;
		}

		/**
		 * @param assignedMemUsage the assignedMemUsage to set
		 */
		public void setAssignedMemUsage(float assignedMemUsage) {
			this.assignedMemUsage = assignedMemUsage;
		}

		/**
		 * @return the unmappedCache
		 */
		public float getUnmappedCache() {
			return unmappedCache;
		}

		/**
		 * @param unmappedCache the unmappedCache to set
		 */
		public void setUnmappedCache(float unmappedCache) {
			this.unmappedCache = unmappedCache;
		}

		/**
		 * @return the totalPageCache
		 */
		public float getTotalPageCache() {
			return totalPageCache;
		}

		/**
		 * @param totalPageCache the totalPageCache to set
		 */
		public void setTotalPageCache(float totalPageCache) {
			this.totalPageCache = totalPageCache;
		}

		/**
		 * @return the maxMemoryUsage
		 */
		public float getMaxMemoryUsage() {
			return maxMemoryUsage;
		}

		/**
		 * @param maxMemoryUsage the maxMemoryUsage to set
		 */
		public void setMaxMemoryUsage(float maxMemoryUsage) {
			this.maxMemoryUsage = maxMemoryUsage;
		}

		/**
		 * @return the iOTime
		 */
		public float getIOTime() {
			return IOTime;
		}

		/**
		 * @param iOTime the iOTime to set
		 */
		public void setIOTime(float iOTime) {
			IOTime = iOTime;
		}

		/**
		 * @return the localDiskUsage
		 */
		public float getLocalDiskUsage() {
			return localDiskUsage;
		}

		/**
		 * @param localDiskUsage the localDiskUsage to set
		 */
		public void setLocalDiskUsage(float localDiskUsage) {
			this.localDiskUsage = localDiskUsage;
		}

		/**
		 * @return the maxCPURate
		 */
		public float getMaxCPURate() {
			return maxCPURate;
		}

		/**
		 * @param maxCPURate the maxCPURate to set
		 */
		public void setMaxCPURate(float maxCPURate) {
			this.maxCPURate = maxCPURate;
		}

		
		/**
		 * @return the maxDiskIOTime
		 */
		public float getMaxDiskIOTime() {
			return maxDiskIOTime;
		}

		/**
		 * @param maxDiskIOTime the maxDiskIOTime to set
		 */
		public void setMaxDiskIOTime(float maxDiskIOTime) {
			this.maxDiskIOTime = maxDiskIOTime;
		}

		/**
		 * @return the cyclesPerInstruction
		 */
		public float getCyclesPerInstruction() {
			return cyclesPerInstruction;
		}

		/**
		 * @param cyclesPerInstruction the cyclesPerInstruction to set
		 */
		public void setCyclesPerInstruction(float cyclesPerInstruction) {
			this.cyclesPerInstruction = cyclesPerInstruction;
		}

		/**
		 * @return the memoryAccessPerInstruction
		 */
		public float getMemoryAccessPerInstruction() {
			return memoryAccessPerInstruction;
		}

		/**
		 * @param memoryAccessPerInstruction the memoryAccessPerInstruction to set
		 */
		public void setMemoryAccessPerInstruction(float memoryAccessPerInstruction) {
			this.memoryAccessPerInstruction = memoryAccessPerInstruction;
		}

		/**
		 * @return the samplePortion
		 */
		public float getSamplePortion() {
			return samplePortion;
		}

		/**
		 * @param samplePortion the samplePortion to set
		 */
		public void setSamplePortion(float samplePortion) {
			this.samplePortion = samplePortion;
		}

		/**
		 * @return the aggregationType
		 */
		public boolean isAggregationType() {
			return aggregationType;
		}

		/**
		 * @param aggregationType the aggregationType to set
		 */
		public void setAggregationType(boolean aggregationType) {
			this.aggregationType = aggregationType;
		}

		/**
		 * @return the sampledCPUUsage
		 */
		public float getSampledCPUUsage() {
			return sampledCPUUsage;
		}

		/**
		 * @param sampledCPUUsage the sampledCPUUsage to set
		 */
		public void setSampledCPUUsage(float sampledCPUUsage) {
			this.sampledCPUUsage = sampledCPUUsage;
		}

		/**
		 * @param _id
		 * @param parentJob
		 * @param hostMachine
		 * @param startTime
		 * @param endTime
		 * @param cPURate
		 * @param canonicalMemUsage
		 * @param assignedMemUsage
		 * @param unmappedCache
		 * @param totalPageCache
		 * @param maxMemoryUsage
		 * @param iOTime
		 * @param localDiskUsage
		 * @param maxCPURate
		 * @param maxDiskIOTime
		 * @param cyclesPerInstruction
		 * @param memoryAccessPerInstruction
		 * @param samplePortion
		 * @param aggregationType
		 * @param sampledCPUUsage
		 */
		public Task(long _id, Job parentJob, Machine hostMachine, long startTime, long endTime, float cPURate, float canonicalMemUsage,
				float assignedMemUsage, float unmappedCache, float totalPageCache, float maxMemoryUsage, float iOTime,
				float localDiskUsage, float maxCPURate, float maxDiskIOTime,
				float cyclesPerInstruction, float memoryAccessPerInstruction, float samplePortion,
				boolean aggregationType, float sampledCPUUsage) {
			super();
			this.taskIndex = _id;
			this.parentJob = parentJob;
			this.hostMachine = hostMachine;
			this.startTime = startTime;
			this.endTime = endTime;
			CPURate = cPURate;
			this.canonicalMemUsage = canonicalMemUsage;
			this.assignedMemUsage = assignedMemUsage;
			this.unmappedCache = unmappedCache;
			this.totalPageCache = totalPageCache;
			this.maxMemoryUsage = maxMemoryUsage;
			IOTime = iOTime;
			this.localDiskUsage = localDiskUsage;
			this.maxCPURate = maxCPURate;
			this.maxDiskIOTime = maxDiskIOTime;
			this.cyclesPerInstruction = cyclesPerInstruction;
			this.memoryAccessPerInstruction = memoryAccessPerInstruction;
			this.samplePortion = samplePortion;
			this.aggregationType = aggregationType;
			this.sampledCPUUsage = sampledCPUUsage;
		}

		public Task() {
			super();
		}

		/**
		 * @return The hosting machine
		 */
		public Machine getHostMachine() {
			return hostMachine;
		}

		/**
		 * @param hostMachine
		 */
		public void setHostMachine(Machine hostMachine) {
			this.hostMachine = hostMachine;
		}


		
		
		
}
