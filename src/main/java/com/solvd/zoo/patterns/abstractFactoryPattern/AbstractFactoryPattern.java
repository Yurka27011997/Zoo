package com.solvd.zoo.patterns.abstractFactoryPattern;

public class AbstractFactoryPattern {

    interface Lion {
        long getLionPrice();
    }

    interface Dog {
        long getDogPrice();
    }

    interface Cat {
        long getCatPrice();
    }

    interface InteAbsFactory {
        Lion getLion();

        Dog getDog();

        Cat getCat();
    }

    static class UaLionImpl implements Lion {

        public long getLionPrice() {
            return 1000;
        }

    }

    static class UaDogImpl implements Dog {
        public long getDogPrice() {
            return 3000;
        }
    }

    static class UaCatImpl implements Cat {
        public long getCatPrice() {
            return 2000;
        }
    }

    static class UaAnimalPriceAbsFactory implements InteAbsFactory {

        @Override
        public Lion getLion() {
            return new UaLionImpl();
        }

        public Dog getDog() {
            return new UaDogImpl();
        }

        public Cat getCat() {
            return new UaCatImpl();
        }
    }

    static class PLLionImpl implements Lion {

        public long getLionPrice() {
            return 10000;
        }
    }

    static class PLDogImpl implements Dog {
        public long getDogPrice() {
            return 30000;
        }

    }

    static class PLCatImpl implements Cat {
        public long getCatPrice() {
            return 20000;
        }
    }

    static class PLAnimalPriceAbsFactory implements InteAbsFactory {

        @Override
        public Lion getLion() {
            return new PLLionImpl();
        }

        public Dog getDog() {
            return new PLDogImpl();
        }

        public Cat getCat() {
            return new PLCatImpl();
        }
    }

}
