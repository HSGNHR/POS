package template;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
        addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();
    final void boilWater(){
        System.out.println("boiling water");
    }
    final void pourInCup(){
        System.out.println("pouring into cup");
    }
    boolean customerWantsCondiments(){
        return true;
    }
}
