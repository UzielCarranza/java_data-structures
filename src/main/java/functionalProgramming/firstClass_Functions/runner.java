package functionalProgramming.firstClass_Functions;

public class runner {

    //    a person class
    protected static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    //    loads data from a server
    protected static class DataLoader {

//        create a public final member variable that will choose which of this private methods to expose to the outside world
//since both function take no arguments, we will use the ano args interface previously created

        public final NoArgFunction<Person> loadPerson;

        //        constructor that tells if our program is in development or in production mode
        public DataLoader(Boolean isDevelopment) {
            this.loadPerson = isDevelopment
                    ? this::loadPersonFake
//                    double colon represents how we refer to an objector classes method as an object of type function
                    : this::loadPersonReal;

        }


        //        returns a real person' data
        private Person loadPersonReal() {
            System.out.println("Loading person");
            return new Person("real person", 23);
        }


        //        returns a fake person' data
        private Person loadPersonFake() {

            System.out.println("returnig fake person object");
            return new Person("fake person", 12);
        }

    }


    public static void main(String[] args) {

//        boolean to tell the program is app is in development
        final Boolean IS_DEVELOPMENT = false;
//        call an instance on Data loader
        DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
//        print to the console the status of loader
        System.out.println(dataLoader.loadPerson.apply());
    }
}
