class animal
{
    public
        void name()
        {
            System.out.print("Name of the animal is bruno \n ");
        }
        void owner()
        {
            System.out.print("owner is naidu\n");
        }
}

class puppy extends animal
{
    public
        void play()
        {
            System.out.print("he is hyper active \n");
        }
        void skills()
        {
            System.out.print("He can easily sense the objects\n");
        }
}

class SimpleInheritance
{
    public static void main(String[] args)
    {
        puppy baby=new puppy();
        baby.name();;
        baby.owner();
        baby.play();
        baby.skills();
    }
}

