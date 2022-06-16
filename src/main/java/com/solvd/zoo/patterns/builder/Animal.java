package com.solvd.zoo.patterns.builder;

class Animal {
    private String typeOfAnimal;
    private String name;
    private int age;

    private Animal(BuilderAnimal builderAnimal) {
        this.typeOfAnimal = builderAnimal.typeOfAnimal;
        this.name = builderAnimal.name;
        this.age = builderAnimal.age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "typeOfAnimal='" + typeOfAnimal + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    static class BuilderAnimal {
        private String typeOfAnimal;
        private String name;
        private int age;

        public BuilderAnimal(String typeOfAnimal) {
            this.typeOfAnimal = typeOfAnimal;
        }

        public BuilderAnimal setName(String name) {
            this.name = name;
            return this;
        }

        public BuilderAnimal setAge(int age) {
            this.age = age;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}
