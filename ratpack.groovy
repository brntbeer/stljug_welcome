@GrabResolver("https://oss.jfrog.org/artifactory/repo")
@Grab(value = "org.ratpack-framework:ratpack-groovy:0.9.0-SNAPSHOT")
import static org.ratpackframework.groovy.RatpackScript.ratpack
import org.ratpackframework.groovy.templating.TemplateRenderer

// You can change anything in the ratpack {} closure without needing to restart

ratpack {
    handlers {
        get {
            get(TemplateRenderer).render "index.html"
        }

        get("date") {
            get(TemplateRenderer).render "date.html"
        }

        assets "public"
    }
}
