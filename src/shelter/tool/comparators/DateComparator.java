package shelter.tool.comparators;

import shelter.domain.entity.Adoption;

import java.util.Comparator;

public class DateComparator implements Comparator<Adoption> {

        @Override
        public int compare(Adoption a1, Adoption a2) {
            if(a1.getDate().after(a2.getDate())){
                return 1;
            } else {
                return -1;
            }
        }
    }
