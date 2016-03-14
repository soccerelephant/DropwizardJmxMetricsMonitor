# DropwizardPerformanceMonitorJMX
Demo dropwizard metrix



 This demo is to export  performance data as MBean through JMX.

How to instrument MBean:

Fire up a Java Visual VM from ...\java\jdk1.8.0_25\bin\jvisualvm.exe, then
from menu Tools/Plugins, install VisualVM-JConsole and VisualVM-MBeans, After
that, MBeans are visible after server is started. From MBeans tab,
MBeans->metrics should display snapshot of captured performance data.

For charting JMXC data using Graphite through jmx-trans, please reference this article:
https://blog.frankel.ch/become-a-devops-with-spring-boot

This framework is also helpful:
http://jhipster.github.io/

These threads are helpful:
http://stackoverflow.com/questions/21736217/java-webapp-metrics-using-spring-injection
https://objectpartners.com/2015/05/07/intelligent-microservice-metrics-with-spring-boot-and-statsd/

