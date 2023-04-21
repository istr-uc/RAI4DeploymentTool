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
The metamodel contains all the required elements to model a RAI4.0 compliant system. The description and validation of the metamodel is described in ["A big data-centric architecture metamodel for Industry 4.0"](https://doi.org/10.1016/j.future.2021.06.020).

## Deployment tool
This deployment tool developed using Java is aimed at automating the deployment of industrial systems defined following RAI4.0 Metamodel. A normal workflow follows this steps:
1. The user generates de model representing every element of the system.
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

There are several models for this case study for different deployment alternatives: monoprocessor, distributed, mixed deployment (usign on premise nodes and containers), etc.
### Power Smart city
This case study consists on an system responsible for managing the data from an electric distribution grid on a smart city. The system should ingest and process the measurements from the home meters and the district and city substations. Using this metrics the system mantains updated the power consumtion curves for each client and makes estimations to replace missing measurements.
### Truck Fleet Management
This case study consists on a system that monitors the different parameters measured by the on-board computer and GPS installed on a fleet of trucks. The systems reads and merges the data form the different streaming sources into a new data stream, that is divided in windows that represets the trips. The system calculates useful statistisc to give realtime insights to the truck drivers about their driving style.

## Publications

### Journal Paper
1. [Patricia López Martínez, Ricardo Dintén, José María Drake, Marta E. Zorrilla: A big data-centric architecture metamodel for Industry 4.0. Future Gener. Comput. Syst. 125: 263-284 (2021)](https://doi.org/10.1016/j.future.2021.06.020)

2. [Dintén, R., López Martínez, P. y Zorrilla, M. (2021) «Arquitectura de referencia para el diseño y desarrollo de aplicaciones para la Industria 4.0», Revista Iberoamericana de Automática e Informática industrial, 18(3), pp. 300–311.](https://polipapers.upv.es/index.php/RIAI/article/view/14532)

### Conference Paper
1. [Ricardo Dintén Herrero, Marta Zorrilla. An I4.0 data intensive platform suitable for the deployment of machine learning models: a predictive maintenance service case study](https://doi.org/10.1016/j.procs.2022.01.300)

### Academic Report

1. [Monitorización en tiempo real del comportamiento en la conducción de vehículos (Sebastián) ]()

2. [Diseño e implementación de una solución BI para el sector logístico Amigo Sañudo, Nicolás (2022-06-12)]()

3. [Aplicación de técnicas de ciencia de datos para mejorar la gestión de flotas de transporte Gutiérrez Mantecón, Jorge (2022-06-17)](https://repositorio.unican.es/xmlui/handle/10902/25814)

4. [Caracterización de tecnologías de procesamiento de datos en streaming sobre una arquitectura orientada al dato. Algorri Álvarez, Miguel](https://repositorio.unican.es/xmlui/handle/10902/16283)

5. [Especificación y ejecución de benchmarks para arquitecturas centradas en el dato. Martín de la Rubia, Luis](https://repositorio.unican.es/xmlui/handle/10902/15271)

6. [Especificación y ejecución de benchmarks sobre el gestor de datos distribuido y escalable Cassandra para aplicaciones de uso intenso de datos en la Industria 4.0. Dintén Herrero, Ricardo](https://repositorio.unican.es/xmlui/handle/10902/16866)