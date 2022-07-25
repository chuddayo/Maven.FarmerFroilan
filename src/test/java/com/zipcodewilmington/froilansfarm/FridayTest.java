package com.zipcodewilmington.froilansfarm;

import Produce.ProduceStore;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FridayTest {

    @Test
    public void eachDayTest() {

        Stable stabley = new Stable();
        while (Farm.getInstance().getTotalHorseCount() < 10) {
            Horse myHorse = new Horse();

            for (int i = Farm.getInstance().getStableList().size() - 1; i < Farm.getInstance().getStableList().size(); i++) {
                if (Farm.getInstance().getStableList().get(i).size() < Farm.getInstance().getStableList().get(i).getMaxNumberOfHorses()) {
                    Farm.getInstance().getStableList().get(i).add(myHorse);
                    System.out.println(Farm.getInstance().getTotalHorseCount() + " horses");
                    System.out.println("In " + Farm.getInstance().getStableList().size() + " stables");
                    break;
                } else {
                    new Stable().add(myHorse);
                    System.out.println(Farm.getInstance().getTotalHorseCount() + " horses");
                    System.out.println("In " + Farm.getInstance().getStableList().size() + " stables");
                    break;
                }
            }
        }

        for (Stable stable : Farm.getInstance().getStableList()) {
            for (int k = 0; k < stable.getNumberOfCreature(); k++) {
                System.out.println("Yeehaw!");
                Froilan.getFroilan().mount(stable.get(k));
                Froilan.getFroilan().dismount(stable.get(k));
                Froilanda.getFroilanda().mount(stable.get(k));
                Froilanda.getFroilanda().dismount(stable.get(k));
                for (int j = 0; j < 3; j++) {
                    stable.get(k).eat(new EarOFCorn());
                }
            }
        }

        System.out.println(Froilan.getFroilan().makeNoise());
        Froilan.getFroilan().eat(new EarOFCorn());
        Froilan.getFroilan().eat(new Tomato());
        Froilan.getFroilan().eat(new Tomato());
        for (int k = 0; k < 5; k++) {
            Froilan.getFroilan().eat(new Egg());
        }
        System.out.println(Froilan.getFroilan().makeNoise());

        Froilanda.getFroilanda().eat(new EarOFCorn());
        Froilanda.getFroilanda().eat(new EarOFCorn());
        Froilanda.getFroilanda().eat(new Tomato());
        Froilanda.getFroilanda().eat(new Egg());
        Froilanda.getFroilanda().eat(new Egg());
        System.out.println(Froilanda.getFroilanda().makeNoise());



        CropDuster<Froilanda> cd = new CropDuster<>(Froilanda.getFroilanda());
        Field field = new Field();
        CropRow<Crop> cropRow = new CropRow<>();

        List<CropRow<Crop>> hvf = new ArrayList<>();

        hvf.add(new CropRow<>());
        Froilanda.getFroilanda().mount(cd);
        field.setFieldList(hvf);
        hvf = field.getFieldList();
        for (int i = 0; i < hvf.size(); i++) {
            cd.fly(hvf.get(i));
        }

        Froilan.getFroilan().makeNoise();
        Froilan.getFroilan().makeNoise();
        Froilan.getFroilan().makeNoise();
        Froilan.getFroilan().makeNoise();
        Froilan.getFroilan().makeNoise();
        Froilan.getFroilan().makeNoise();
        Froilan.getFroilan().makeNoise();
        Froilan.getFroilan().makeNoise();
        Froilan.getFroilan().makeNoise();
        Froilan.getFroilan().makeNoise();
        Froilan.getFroilan().makeNoise();
        Froilan.getFroilan().makeNoise();
        Froilan.getFroilan().makeNoise();
        Froilan.getFroilan().makeNoise();
        Froilan.getFroilan().makeNoise();


        Tractor<Froilan> frolianTractor = new Tractor<>(Froilan.getFroilan());
        Froilan.getFroilan().mount(frolianTractor);

        for(CropRow<Crop> crop : hvf) {
            frolianTractor.operate(crop);
        }
        Froilan.getFroilan().dismount(frolianTractor);

//        ProduceStore.getInstance().getQuantityInStorage();


    }
}