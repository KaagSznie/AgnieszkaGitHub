
package agnieszkagithub.creationSimpleObject;

public class testAliment {
    
    public static void main(String[] args) {
        
        Category legume = new Category("légume");
        Category fruit = new Category("fruit");
        Category viande = new Category("viande");
        
        /*
        Category[] categoryList = new Category[3];
        categoryList[0] = new Category("légume");
        categoryList[1] = new Category("fruit");
        categoryList[2] = new Category("viande");
        */
        
        Aliment carotte = new Aliment("carotte", legume, 43, 2);
        Aliment pomme = new Aliment("pomme", fruit, 50.7, 3);
        
        System.out.println("Mon premier legume s'appelle " + carotte.name + ". C'est un " + carotte.category.name + ". Son apport calorique est de " + carotte.kcal + " kcal. Il coûte " + carotte.price + " €.");
        System.out.println(carotte);
        System.out.println(pomme);
    }
}
