Xperimenter: DOE-based Experiment Management Environment
=====================================================

Welcome to the Xperimenter development page!  This release includes the latest version of Xperimenter Environment (DSL grammar, Editor, Management Product, Kepler Translator, etc).

Download
--------

Please refer to the Xperimenter project page to download the latest release:

	https://odayibas.github.io/xperimenter/


Prerequisites for Development
------------

Note that the Xperimenter environment requires the Eclipse Modeling Project plugins to be built. Download the latest version of the framework from

	http://eclipse.org/modeling/

and install it into your local eclipse distribution.

Introduction
------------
Ultimate goal of a simulation practitioner is to understand a system (natural or synthetic) by running a corresponding model. This is obvious that the success of that endeavor is depended to systematic apporaches and planning ahead. Our proposed solution is to support computer simulation domain by using model-driven development practices. 

Xperimenter is an external domain-specific language to specify simulation experiments. As a declarative language, it is used to declare user requirements about an experiment. The translator generates the target environment entities as runnable assets. Later, target environment uses these assets to replicate the originator's experiment. Xperimenter also has a mechanism to manage experiment variants. The fragments of an experiment specification are mapped to the features and these selectable features are used to provide a mechanism for managed reuse.

{% highlight java %}
experiment exp_A
{
 desc " brief description of the purpose of the experiment ";
 objective COMPARATIVE ;
 design FULL_FACT_DESIGN ;
 simulation SIMULATION_A ;
 analysis STAT_MTD_ANOVA ;
 visual BARCHART ;
 timeout 180;
}
{% endhighlight %}

The "experiment" specification involves a reference to an experiment design and each design is given a name to refer to it, a sampling method to be used and a list of variables.

{% highlight java %}
design FULL_FACT_DESIGN
{
 method FULLFACTORIAL ;
 varlist X,Y,Z;
}
{% endhighlight %}
