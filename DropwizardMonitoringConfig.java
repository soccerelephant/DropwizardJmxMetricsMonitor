package com.example;

import org.springframework.context.annotation.Configuration;

import com.codahale.metrics.JmxReporter;
import com.codahale.metrics.MetricRegistry;
import com.ryantenney.metrics.spring.config.annotation.EnableMetrics;
import com.ryantenney.metrics.spring.config.annotation.MetricsConfigurerAdapter;

@Configuration
@EnableMetrics(proxyTargetClass = true)
public class DropwizardMonitoringConfig extends MetricsConfigurerAdapter {

	@Override
	public void configureReporters(MetricRegistry metricRegistry) {
		System.out.println("shawn metricRegistry: " + metricRegistry);
		final JmxReporter jmxReporter = JmxReporter.forRegistry(metricRegistry).build();
		jmxReporter.start();
	}

}