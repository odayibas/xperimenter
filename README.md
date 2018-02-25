Xperimenter: DOE-based Experiment Management Environment
=====================================================

Welcome to the Xperimenter development page!  This release includes the latest version of Xperimenter Environment (DSL grammar, Editor, Management Product, Kepler Translator, etc).

# Download
Please refer to the Xperimenter project page to download the latest release:

	https://odayibas.github.io/xperimenter/


# Prerequisites for Development
Note that the Xperimenter environment requires the Eclipse Modeling Project plugins to be built. Download the latest version of the framework from

	http://eclipse.org/modeling/

and install it into your local eclipse distribution.

# Introduction
Ultimate goal of a simulation practitioner is to understand a system (natural or synthetic) by running a corresponding model. This is obvious that the success of that endeavor is depended to a systematic approach and planning ahead. Our proposed solution is to support computer simulation domain by using model-driven development practices. 

Xperimenter is an external domain-specific language to specify simulation experiments. As a declarative language, it is used to declare user requirements about an experiment. The translator generates the target environment entities as runnable assets. Later, target environment uses these assets to replicate the originator's experiment. Xperimenter also has a mechanism to manage experiment variants. The fragments of an experiment specification are mapped to the features and these selectable features are used to provide a mechanism for managed reuse.

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

statAnalysis STAT_MTD_ANOVA
{
	service tr.edu.metu.ceng.xperimenter.statistics.OneWayAnova;
}
{% endhighlight %}

**design** entity involves a set of references to the variables and the concrete definition of the variable covers its classification and its high/low values. It is also possible to attach a pseudo random number generator (**generator** in the code) to the variables to introduce randomness in stochastic models:

{% highlight java %}
variable X : FLOAT group FACTOR [0.5 , 1.5];
variable Y : INTEGER group FACTOR [0.3 , 2.4];
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
## Variables
## Constants
## Expressions

Operators
Control Structures
Functions
Classes and Objects
Namespaces
Errors
Exceptions
Generators
References Explained
Predefined Variables
Predefined Exceptions
Predefined Interfaces and Classes
Context options and parameters
Supported Protocols and Wrappers
