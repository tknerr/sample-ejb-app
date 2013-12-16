
## Headline

This is a sample Maven Java EE ear/war/ejb project demonstrating dependency injection via annotations (e.g. `@Stateless`, `@EJB`) which can be overridden from XML deployment descriptors (e.g. `ejb-jar.xml` or `application.xml`).

## The Problem

As long as there is only a single implementation for a given bean interface, there is no problem at all. Once you add additional bean implementations you have to specify which implementation to use, otherwise the deployment will fail.

## The Solution

There are two use cases:

1.  All EJB implementations are in the same ejb module 
    * use the `ejb-jar.xml` in the ejb module to specify the bean implementation
    * working sample: browse [sample-ejb-app@249cbe](https://github.com/tknerr/sample-ejb-app/tree/249cbe7247095495f9875f9aaf0334efbb8a1304)
2.  EJB implementations are spread across multiple ejb modules
    * use the `application.xml` in the ear project to specify the bean implementation
    * working sample: browse [sample-ejb-app@d6659a](https://github.com/tknerr/sample-ejb-app/tree/d6659adef967fdc20dcfd6473665480695c9103c)
