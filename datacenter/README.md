# Datacenter random instantiator

This program produces sets of random instances for a simplified Datacenter metamodel. This generator is deterministic, and provides the same set of result instances when a seed is specified.

The instantiation process is guided by two main parameters *topology size* (i.e., expected number of machines that are desired to be generated) and *task to machine factor* that decides the average of tasks to be assigned to each machine.
The generator allows exporting the generated models to their CSV counter-part.

## Running the random generation

The *EMF random instantiator* can be directly executed using the provided Uber JAR.

```
$ java -jar datacenter.jar <program arguments>
```

Although the generator is provided with default parameters, for generating models for different tastes, a set of parameters can be configured as shown in the *usage information*:

```
$ sage: java -jar <this-file.jar> [-v <properties deviation>] [-x] [-o
       <path_to_output.dir>] [-n <models>] [-s <size>] [-p <proportion>] [-d
       <degree>] [-z <size>] [-e <seed>] [-f] [-g]
 -v,--properties-variation <properties deviation>   Variation ([0..1]) in the
                                                    properties' size (defaults
                                                    to 0.1)
 -x,--factor                                        The # tasks per machine
                                                    factor (default 64)
 -o,--output-dir <path_to_output.dir>               Output directory (defaults
                                                    to working dir)
 -n,--number-models <models>                        Number of generated models
                                                    (defaults to 1)
 -s,--size <size>                                   Average models' size
                                                    (defaults to 1,000)
 -p,--variation <proportion>                        Variation ([0..1]) in the
                                                    models' size (defaults to
                                                    0.1)
 -d,--references-degree <degree>                    Average number of references
                                                    per EObject (defaults to 8).
                                                    Actual sizes may vary +/-
                                                    10%.
 -z,--values-size <size>                            Average size for attributes
                                                    with variable length
                                                    (defaults to 64). Actual
                                                    sizes may vary +/- 10%.
 -e,--seed <seed>                                   Seed number (random by
                                                    default)
 -f,--force                                         Force the generation, even
                                                    if input metamodels contain
                                                    errors
 -g,--diagnose                                      Run diagnosis on the result
                                                    model
```

## Credits

This program relies on the [Instantiator](https://github.com/atlanmod/mondo-atlzoo-benchmark/tree/master/fr.inria.atlanmod.instantiator) developed by the [AtlanMod Team](http://www.emn.fr/z-info/atlanmod/index.php/Main_Page) (Inria, Mines-Nantes, Lina).
