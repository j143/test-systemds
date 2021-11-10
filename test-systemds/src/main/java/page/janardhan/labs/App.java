package page.janardhan.labs;

import static org.apache.sysds.api.mlcontext.ScriptFactory.dmlFromUrl;
import org.apache.sysds.api.mlcontext.Script;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String urlString = "https://raw.githubusercontent.com/apache/systemds/main/src/test/scripts/applications/hits/HITS.dml";
        Script script = dmlFromUrl(urlString);
        String s = script.getScriptString();
        System.out.println(s);
    }
}
