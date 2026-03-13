package org.kovan.intern.oops_and_architectural_thinking.Interfaces_vs_Abstract_Classes;
interface Plugin{
    void execute();
}
class CoreSystem{
    void runPlugins(Plugin[] plugins){
        for(Plugin p:plugins){
            p.execute();
        }
    }

}
public class AnonymousInnerClasses {
    public static void main(String[] args){
        Plugin p1=new Plugin(){
            public void execute(){
                System.out.println("Authentication Plugin Running");
            }
        };

        Plugin p2=new Plugin(){
            public void execute(){
                System.out.println("Logging Plugin Running");
            }
        };
        Plugin p3=new Plugin(){
            public void execute(){
                System.out.println("Something Running in the Backround");
            }
        };
        Plugin[] plugins={p1,p2,p3};
        CoreSystem system=new CoreSystem();
        system.runPlugins(plugins);


    }
}
