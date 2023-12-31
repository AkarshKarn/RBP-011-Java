public class Assignment_17_07_23 {
    public static void main(String[] args) {

       BlueWhale b1 = new BlueWhale();
       b1.birth();
       b1.live();
       b1.death();
        System.out.println();


        BhagvatGita g1 = new BhagvatGita();
        g1.print();
        g1.sell();
        g1.preach();
        System.out.println();

        Man m1 = new Man();
        m1.study();
        m1.work();
        m1.travel();
        System.out.println();


        Frog f1 = new Frog();
       f1.birth();
       f1.live();
       f1.death();
        System.out.println();

        Lizard l1 = new Lizard();
        l1.birth();
        l1.live();
        l1.death();

    }
}



class Mammals{
    void birth(){
        System.out.println("Mammal is born");
    }
    void live(){
        System.out.println("Mammal is living");
    }
    void death(){
        System.out.println("Mammal has died");
    }
}

class BlueWhale extends Mammals{
    @Override
    void birth(){
        System.out.println("BlueWhale is born");
    }
    @Override
    void live(){
        System.out.println("BlueWhale is living");
    }
    @Override
    void death(){
        System.out.println("BlueWhale has died");
    }

}




class Books{
    void print(){
        System.out.println("Book is printed");
    }
    void sell(){
        System.out.println("Book is sold");
    }
    void preach(){
        System.out.println("Book is preached");
    }
}

class BhagvatGita extends Books{

    @Override
    void print(){
        System.out.println("BhagvatGita is printed");
        System.out.println();
    }

    @Override
    void sell(){
        System.out.println("BhagvatGita is sold");
        Disciple d1 = new Disciple();
        d1.purchase();
        System.out.println();
    }
    @Override
    void preach(){
        System.out.println("BhagvatGita is preached");
        Disciple d1 = new Disciple();
        d1.read();
    }
}

class Disciple{
    void purchase(){
        System.out.println("Disciple is purchasing");
    }
    void read(){
        System.out.println("Disciple is reading");
    }
}


class Humans{
    void study(){
        System.out.println("Humans study");
    }
    void work(){
        System.out.println("Human is working");

    }
    void travel(){
        System.out.println("Human is travelling");
    }
}

class Man extends Humans {

    @Override
    void study() {
        System.out.println("Man is studying");
    }

    @Override
    void work() {
        System.out.println("Man is working");
    }

    @Override
    void travel() {
        System.out.println("Man is travelling");
    }

}




class Amphibians{
    void birth(){
        System.out.println("Amphibians is born");
    }
    void live(){
        System.out.println("Amphibians is living");
    }
    void death(){
        System.out.println("Amphibians has died");
    }
}

class Frog extends Amphibians{
    @Override
    void birth(){
        System.out.println("Frog is born");
    }
    @Override
    void live(){
        System.out.println("Frog is living");
    }
    @Override
    void death(){
        System.out.println("Frog has died");
    }

}


class Reptiles{
    void birth(){
        System.out.println("Reptiles is born");
    }
    void live(){
        System.out.println("Reptiles is living");
    }
    void death(){
        System.out.println("Reptiles has died");
    }
}

class Lizard extends Reptiles{
    @Override
    void birth(){
        System.out.println("Lizard is born");
        Eagle e1 = new Eagle();
        e1.hunt();
        System.out.println();
    }
    @Override
    void live(){
        System.out.println("Lizard is living");
        Eagle e1 = new Eagle();
        e1.eat();
        System.out.println();
    }
    @Override
    void death(){
        System.out.println("Lizard has died");
    }

}

class Eagle{
    void hunt(){
        System.out.println("Eagle is hunting");
    }
    void eat(){
        System.out.println("Eagle is eating");
    }
}



