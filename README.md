Xperimenter: DOE-based Experiment Management Environment
=====================================================

Welcome to the Xperimenter development page!  The repository includes the latest version of Xperimenter Environment (DSL grammar, Editor, Management Product, Kepler Translator, etc.). The main goal of this page is to create an entry point for both power and true users of Xperimenter.

* This will become a table of contents (this text will be scraped).
{:toc}

# Introduction
Ultimate goal of a simulation practitioner is to understand a system (natural or synthetic) by running a corresponding model. This is obvious that the success of that endeavor is depended to a systematic approach and planning ahead. Our proposed solution is to support computer simulation domain by using model-driven development practices. 

Xperimenter is an external domain-specific language to specify simulation experiments. As a declarative language, it is used to declare user requirements about an experiment. The translator generates the target environment entities as runnable assets. Later, target environment uses these assets to replicate the originator's experiment. Xperimenter also has a mechanism to manage experiment variants. The fragments of an experiment specification are mapped to the features and these selectable features are used to provide a mechanism for managed reuse.

# Download
Please refer to the Xperimenter project page to download the latest release:

	https://odayibas.github.io/xperimenter/


# Prerequisites for Development
Note that the Xperimenter environment requires the Eclipse Modeling Project plugins to be built. Download the latest version of the framework from

	http://eclipse.org/modeling/

and install it into your local eclipse distribution.

# Using Xperimenter
The goal of introducing new DSL is twofold: First, it is the medium of specifying simulation experiments. Users are able to declare their requirements in the problem space and these declarations are used to generate respective solution artifacts by the language translator. Secondly, fragments of an experiment specification are mapped to features to manage simulation experiment variability.

## Specifying an Experiment
Experiment specification consists of a runnable model and some configuration items at the bare minumum. In this basic form, there is no any variablitiy and the experiment denotes only one setup.

{% highlight java %}
experiment exp_A
{
 desc "brief description of the purpose of the experiment";
 objective COMPARATIVE;
 design FULL_FACT_DESIGN;
 simulation SIMULATION_A;
 analysis STAT_MTD_ANOVA;
 visual BARCHART;
 timeout 180;
}
{% endhighlight %}

The **experiment** specification involves a reference to an experiment design and each design is given a name to refer to it, a sampling method to be used and a list of variables.

{% highlight java %}
design FULL_FACT_DESIGN
{
 method FULLFACTORIAL;
 varlist X,Y,Z;
}
{% endhighlight %}

Xperimenter assumes that the **modelFile** is a runnable entity in the target platform to provide a platform independent way to execute the simulation model. Additional information like **modelType** is left optional because current implementation does not use it, but it might be used for prospective target platforms. A similar approach is also used to define the statistical analysis method.

{% highlight java %}
simulation SIMULATION_A
{
	modelFile tr.edu.metu.ceng.xperimenter.model.SimA;
	modelType CONTINUOUS;
	inport inX : X;
	inport inY : Y;
	inport inZ : Z;
	outport outZ : K;
}

analysis STAT_MTD_ANOVA
{
	service tr.edu.metu.ceng.xperimenter.statistics.OneWayAnova;
}
{% endhighlight %}

**design** entity involves a set of references to the variables and the concrete definition of the variable covers its classification and its high/low values. It is also possible to attach a pseudo random number generator (**generator** in the code) to the variables to introduce randomness in stochastic models:

{% highlight java %}
variable X : FLOAT group FACTOR [0.5 , 1.5];
variable Y : INTEGER group FACTOR [3 , 14];
variable Z : FLOAT group NUISANCE gen NUM_GEN_1;
variable K : FLOAT group RESPONSE;

generator NUM_GEN_1
{
	service tr.edu.metu.ceng.xperimenter.numgen.Mersenne;
	seed 1024;
}
{% endhighlight %}

## Specifying Variants of an Experiment Family
In terms of variability management, an experiment family defines a set of variants that can be selected by the user to specify a member of that family (a particular experiment). A way to annotate DSL snippets with features need to be provided in the DSL environment. The design environment applies that method by using preprocessor directives. It is very similar to C-style conditional compilation:

{% highlight java %}
#ifdef Mersenne
generator NUM_GEN_1
{
	service tr.edu.metu.ceng.xperimenter.numgen.Mersenne;
	seed 1024;
}
#endif

#ifdef Fibonacci
generator NUM_GEN_1
{
	service tr.edu.metu.ceng.xperimenter.numgen.Fibonacci;
	seed 512;
}
#endif
{% endhighlight %}

The above method allows a user to specify a set of variants and to map them to the feature model. The resulting specification creates a feature annotated code and then the language processor superimposes the selected feature configuration onto the provided code to extract a particular valid experiment specification. For instance, above code snippet includes two random number generators with the same name. According to the grammar, these two generators cannot reside in a single experiment. The simulation experiment feature model allows the selection of only one of the alternative options in a valid feature configuration. Therefore, the actual experiment uses one generator according to user provided feature configuration.

# Language Reference
## Types
![domain model]({{ site.url }}/xperimenter/doc/img/domain_model.png)

|**Element**|**Description**|
|-----------|---------------|
|experiment|The root element of each experiment. Its atttibutes may be binded by using variability management preprocessor on the other hand, only one **experiment** element is expected in a xperimenter file (*.xpr).|
|simulation|Defines the URI and type of simulation model.It also includes input/output port definitions of the model|
|design|Defines control variables and experimental design such as full factorial, fractional factorial, etc.|
|analysis|Defines the URI of the statistical analysis service.|
|variable|Defines data type, group of a variable. High/low values for factors, generator reference for nuisances are also listed here.|
|generator|Defines a PRNG by stating service URI and its seed value.|

## Values, Variables and Experssions
* **variable** definitions incorporate high/low values for factors and a generator reference for nuisances.
* Generic information holders such as **desc** are generally assigned with string literals (defined using double quotation mark).
* Java-style commenting is possible throughout the experiment definition code.
* Optional parts (e.g. specifyinh **timeout** in **experiment**) must be omitted completely (not just omitting value part) to avoid getting error (the editor will guide you by highlighting, though)

## Constants

|**Enumeration Name**|**Values**|
|--------------------|----------|
|Objective|COMPARATIVE, SCREENING, RESPSURFACE|
|SamplingMethod|FACTORIAL, FRACFACTORIAL, CENTRALCOMP|
|SimModelType|STATIC, CONTINUOUS, DESCRITEEVENT|
|VariableGroup|UNDEFINED, FACTOR, RESPONSE, NUISANCE|
|VariableType|BOOLEAN, INTEGER, FLOAT, STRING|
|VisualizationType|DEFAULT, HISTOGRAM, SCATTERPLOT, BARCHART|

# Future Works

* **Extending feature/domain model:** Variability management and execution methods of Xperimenter relies on feature and domain models respectively (please refer to [our Journal of Simulation paper](https://doi.org/10.1080/17477778.2017.1418638) for details). Therefore, extending/enriching these model creates finer grained features and more efficient variability management becomes possible.
* **Adding support for other target environments:** Additional translators can be developed to support the environments other than Kepler (e.g. pure Java, Repast).
* **Big Data Analytics & ML:** Experiment family specifications and generated by-products throughout the lifespan of any experiment can be used to understand the methods & approaches of the domain experts. In this respect, Xperimenter is our proposed shared medium to manage simulation experiments and it can be extended by [active learning](https://becominghuman.ai/accelerate-machine-learning-with-active-learning-96cea4b72fdb) module to guide practioners while specifying/revising an experiment.
* **Simulation Experiment on the Cloud:** All phases of the experiment management lifecycle may be provided as a service. In this respect, using model-driven development practices can be seen as a enabling technology to introduce a PaaS for simulation experiments.
