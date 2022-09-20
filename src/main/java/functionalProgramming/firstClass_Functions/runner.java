package functionalProgramming.firstClass_Functions;

public class runner {

    //    a person class
    protected class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    //    loads data from a server
    public class DataLoader {

//        create a public final member variable that will choose which of this private methods to expose to the outside world
//since both function take no arguments, we will use the ano args interface previously created

        public final NoArgFunction<Person> loadPerson;

        //        constructor that tells if our program is in development or in production mode
        public DataLoader(Boolean isDevelopment) {

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

    }
}
