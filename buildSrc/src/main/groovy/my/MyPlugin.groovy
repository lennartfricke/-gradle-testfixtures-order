package my;


import org.gradle.api.Plugin;
import org.gradle.api.Project;

class MyPlugin implements Plugin<Project> {

    void apply(Project project) {
        project.sourceSets {
            test {
                runtimeClasspath += project.layout.files("extraClass")
            }
        }
    }
}