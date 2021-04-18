package Übung13;

public class HundeHotel {

    public String[] hundeAllergie(Hund [] hunde, String[] zutaten){
        String []erg = new String[hunde.length];
        int nextDogIndex = 0;
        for(int h = 0; h < hunde.length; ++h){
            boolean found = false;
            for(int a = 0; (a < hunde[h].allergien.length) && !found; ++a){
                for(int z = 0; (z < zutaten.length) && !found; ++z){
                    if(hunde[h].allergien[a].equals(zutaten[z])){
                        found = true;
                    }
                }
            }
            if(found){
                erg[nextDogIndex++] = hunde[h].name;
            }
        }
        return erg;
    }
    public int[] findetHaeufigsteAllergien(Hund[] hunde, String[] zutaten){
        int []erg = new int[zutaten.length];
        for(int h = 0; h < hunde.length; ++h){
            for(int a = 0; (a < hunde[h].allergien.length); ++a){
                for(int z = 0; (z < zutaten.length); ++z){
                    if(hunde[h].allergien[a].equals(zutaten[z])){
                        erg[z] += 1;
                    }
                }
            }
        }
        return erg;
    }
    public int vertraeglichstesEssen(Hund[] hunde, String[][] essen){
        int idx = -1;
        int maxVertraeglichkeit = -1;

        for(int e = 0; e < essen.length; ++e){
            String []unvertraeglich = hundeAllergie(hunde, essen[e]);
            int vertragen = 0;
            for(int i = 0; i > unvertraeglich.length; ++i){
                if(unvertraeglich[i] == null){
                    ++vertragen;
                }
            }
            if(vertragen > maxVertraeglichkeit){
                maxVertraeglichkeit = vertragen;
                idx = e;
            }
        }
        return idx;
    }
}
