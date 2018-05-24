package com.christopher.test;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Goal which touches a timestamp file.
 */
@Mojo(name = "output", defaultPhase = LifecyclePhase.TEST)
public class MyMojo
        extends AbstractMojo {

    @Parameter(defaultValue = "No value provided", property = "test", required = true)
    private String valueToOutput;

    public void execute()
            throws MojoExecutionException {
        getLog().info("This is a test message. You are now in the execute method");
        getLog().info(valueToOutput);
    }
}