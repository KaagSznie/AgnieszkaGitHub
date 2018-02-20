package Heritage.filesystem;

public class DemoFS {

    public static void main(String[] args) {
        Directory directory = new Directory("root");      
        File file = new File("readme.txt", 100_000_000);
        Node[] list = {file, directory};
        
        for (Node node : list) {
            System.out.println(node.toString());}
            
            
        Directory www = new Directory("www");
        Directory my_app = new Directory("my_app");
        
        File notex = new File("notex", 200);
        File readme = new File("readme.txt", 50);
        
        notex.parent = my_app;
        readme.parent = www;
        my_app.parent = www;
        www.parent = null;
        
        
        www.children[0] = my_app;
        www.children[1] = notex;
        
        my_app.children[0] = readme;
        
        System.out.println("");
        System.out.println(www.name + " has parent " + www.parent + " and children : 1 : " + www.children[0] + " 2 : " + www.children[1]);
        
        System.out.println("");
        System.out.println(my_app.name + " has parent " + my_app.parent + " and children : " + my_app.children[0]);
        }
    }
