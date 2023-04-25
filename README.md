# RAI4.0
This repository contains the **RAI4.0 metamodel**, the **RAI4 deployment tool** and the models of the different **case studies** used to test and validate them.

The repository is organized as follows:
* Root
    * Deployment Tool
        + metamodels
            - RAI4.0 metamodel (.ecore file)
        + src
    * Case Studies
        + Pollution
        + PowerSmartCity
        + Truck Fleet Monitoring
        + Others
    * README.md

## RAI4.0 Metamodel
The metamodel contains all the required elements to model a RAI4.0 compliant system. 

The description and validation of the metamodel is explained in ["A big data-centric architecture metamodel for Industry 4.0"](https://doi.org/10.1016/j.future.2021.06.020). The version of the metamodel and the deployment tool explained in this paper are available [here](https://github.com/istr-uc/RAI4DeploymentTool/releases/tag/vFGCS2021) (tag vFGCS2021).

## Deployment tool
This deployment tool developed using Java is aimed at automating the deployment of industrial systems defined following RAI4.0 Metamodel. A common workflow follows this steps:
1. The user generates a RAI4 model (.ecore file) representing every element of the system.
2. The user runs the deployment tool.

    3.1 The tool takes the .ecore model as input and generates all the config files and scripts needed to deploy the application.

    3.2 After generating the files, the deployment tool transfers the files to the corresponding nodes and executes the scripts to start the diffent services taking into account the dependencies between them.

    3.3. Finally, the tool creates the topics and runs the workflows.

More details about the motivation and the implementations of the deployment tool are available in ["A big data-centric architecture metamodel for Industry 4.0"](https://doi.org/10.1016/j.future.2021.06.020).

### Tool usage


The tool can be executed as an standard java aplication via java -jar command.

`java -jar RAI4-0_DeploymentTool.jar [model]`


## Case Studies
This section contais the models of the case studies used to validate the metamodel and the deployment tool.
### Pollution
This case study consists on an application that monitors some pollution indicators in a smart city. This is achieved by processing data from an open data project that offers the measurements gathered by a set of sensors installed on public transport vehicles.

There are several models designed for different deployment scenarios: monoprocessor, distributed, mixed deployment (using on-premise nodes, cloud nodes and containers), etc.
### Power Smart city
This case study consists on an system responsible for managing the data from an electric distribution grid on a smart city. The system ingests and processes the measurements from the home meters and the district and city substations. Using these metrics, the system mantains updated the power consumption curves for each client and makes estimations to replace missing measurements.
### Truck Fleet Management
This case study consists on a system that monitors the different parameters measured by the on-board computers and GPS installed on a fleet of trucks. The system reads and merges the data from the different streaming sources into a new data stream, that is divided in windows that represent the trips. The system calculates useful statistisc to give realtime insights to the truck drivers about their driving style.

## Publications

### Journal Paper
1. [Patricia López Martínez, Ricardo Dintén, José María Drake, Marta E. Zorrilla: A big data-centric architecture metamodel for Industry 4.0. Future Generation Computer Systems, Volume 125, pp. 263-284 (2021)](https://doi.org/10.1016/j.future.2021.06.020)

2. [Ricardo Dintén, Patricia López Martínez, Marta Zorrilla. Arquitectura de referencia para el diseño y desarrollo de aplicaciones para la Industria 4.0, Revista Iberoamericana de Automática e Informática industrial, 18(3), pp. 300–311. (2021)](https://polipapers.upv.es/index.php/RIAI/article/view/14532)

### Conference Paper
1. [Ricardo Dintén Herrero, Marta Zorrilla. An I4.0 data intensive platform suitable for the deployment of machine learning models: a predictive maintenance service case study, Procedia Computer Science, Volume 200, pp. 1014-1023 (2022) (ISM 2021)](https://doi.org/10.1016/j.procs.2022.01.300)

2. [Ricardo Dintén, Sebastián García, Marta Zorrilla. Fleet management systems in Logistics 4.0 era: a real time distributed and scalable architectural proposal, Procedia Computer Science, Volume 217, pp. 806-815 (2023) (ISM 2022)] https://doi.org/10.1016/j.procs.2022.12.277.

### Academic Report

1. [Monitorización en tiempo real del comportamiento en la conducción de vehículos (Sebastián García, September 2022)]()

2. [Diseño e implementación de una solución BI para el sector logístico (Nicolás Amigo Sañudo, June 2022)](https://repositorio.unican.es/xmlui/handle/10902/25842)

3. [Aplicación de técnicas de ciencia de datos para mejorar la gestión de flotas de transporte (Jorge Gutiérrez Mantecón, June 2022)](https://repositorio.unican.es/xmlui/handle/10902/25814)

4. [Caracterización de tecnologías de procesamiento de datos en streaming sobre una arquitectura orientada al dato (Miguel Algorri Álvarez, October 2018)](https://repositorio.unican.es/xmlui/handle/10902/16283)

5. [Especificación y ejecución de benchmarks para arquitecturas centradas en el dato (Luis Martín de la Rubia, June 2018)](https://repositorio.unican.es/xmlui/handle/10902/15271)

6. [Especificación y ejecución de benchmarks sobre el gestor de datos distribuido y escalable Cassandra para aplicaciones de uso intenso de datos en la Industria 4.0 (Ricardo Dintén Herrero, June 2019)](https://repositorio.unican.es/xmlui/handle/10902/16866)
