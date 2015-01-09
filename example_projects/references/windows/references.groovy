import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

println ansi().fg(GREEN).a("\nGROOVY REFERENCES").reset()
println "**********************"
println ansi().fg(GREEN).a("Getting Started:").reset()
println "http://groovy.codehaus.org/Getting+Started+Guide \n"
println ansi().fg(GREEN).a("Download:").reset()
println "http://docs.codehaus.org/display/GROOVY/Download \n"
println ansi().fg(GREEN).a("Examples:").reset()
println "http://groovy.codehaus.org/Cookbook+Examples \n"
println ansi().fg(GREEN).a("Gradle:").reset()
println "http://www.gradle.org \n"
println ansi().fg(GREEN).a("Writing Scripts in Gradle:").reset()
println "http://www.gradle.org/docs/current/userguide/writing_build_scripts.html \n"