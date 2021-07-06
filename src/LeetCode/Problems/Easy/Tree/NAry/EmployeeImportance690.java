package LeetCode.Problems.Easy.Tree.NAry;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImportance690 {
    public static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;

        public int getImportance(List<Employee> employees, int id) {
            List<Integer> sub= new ArrayList<>();
            int total_imp =0;
            for(Employee e: employees){
                if(e.id==id){
                    total_imp+=e.importance;
                    sub=e.subordinates;
                }
            }
            if(sub.size()==0) return total_imp;
            for(Employee e : employees){
                if(sub.contains(e.id)){
                    total_imp+=getImportance(employees,e.id);
                    sub.remove((Integer) e.id);
                }
                if(sub.size()==0){
                    break;
                }
            }
            return total_imp;
        }
    }

}
