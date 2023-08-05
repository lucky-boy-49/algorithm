package main.huawei_machine_test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * AI面板识别
 */
public class AIPanelRecognition {

    public static void solution(String[] lights) {
        List<Light> lightList = new ArrayList<>();
        for (String line : lights) {
            String[] numStrArr = line.split(" ");
            int id = Integer.parseInt(numStrArr[0]);
            int x1 = Integer.parseInt(numStrArr[1]);
            int y1 = Integer.parseInt(numStrArr[2]);
            int x2 = Integer.parseInt(numStrArr[3]);
            int y2 = Integer.parseInt(numStrArr[4]);
            Light light = new Light(id, x1, y1, x2, y2);
            lightList.add(light);
        }
        while (!lightList.isEmpty()) {
            Light maxLight = getMaxLight(lightList);
            List<Light> sameLineLights = getSameLineLights(maxLight, lightList);
            sameLineLights.sort(new Comparator<Light>() {
                @Override
                public int compare(Light o1, Light o2) {
                    return Integer.compare(o1.x1, o2.x1);
                }
            });
            for (Light l : sameLineLights) {
                System.out.print(l.id + " ");
            }
        }
    }

    private static Light getMaxLight(List<Light> lightList) {
        Light light = null;
        for (Light lt : lightList) {
            if (light == null) {
                light = lt;
            }
            if (lt.y1 < light.y1) {
                light = lt;
            }
            if (lt.y1 == light.y1) {
                if (lt.x1 < light.x1) {
                    light = lt;
                }
            }
        }
        return light;
    }

    private static List<Light> getSameLineLights(Light light, List<Light> lightList) {
        List<Light> lights = new ArrayList<>();
        for (Light lt : lightList) {
            if (lt.y1 == light.y1 || (light.y1 - lt.y1) >= (light.y1 - light.y2) / 2) {
                lights.add(lt);
            }
        }
        lightList.removeAll(lights);
        return lights;
    }

}

class Light {
    int id, x1, y1, x2, y2;

    public Light(int id, int x1, int y1, int x2, int y2) {
        super();
        this.id = id;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

}