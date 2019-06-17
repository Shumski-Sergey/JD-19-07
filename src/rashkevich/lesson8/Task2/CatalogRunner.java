package rashkevich.lesson8.Task2;

public class CatalogRunner {
    public static void main(String ...hi){
        String str[]={"one","two","three","four", "hundred","billion"};
        Catalog<String> cat=new Catalog<String>();
        cat.setList(str);
        cat.getListFirstFive();
    }
}
