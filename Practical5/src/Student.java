
public class Student {
        private String studentID;
        private String name;
        private String school;
    public Student(){
        
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }
    public String toString(){
        return "Student ID:"+studentID+"\n"+
                "Name: "+name+"\n"+
                "School: "+school;
    }
        
    public static boolean validateStudentId(Student s){
 
        
        if(s.school=="FASC"){
            char ch=s.studentID.charAt(0);
            if(s.studentID.length()!=6){
                return false;
            }else{
                
             if(ch!='A'){
                return false;
             }else{
                if(s.studentID.matches("A\\d{5}")){
                    return true;
                }else{
                    return false;
                }
                
             }
            
            }
        
        
        }else if(s.school=="FAFB"){
              char ch=s.studentID.charAt(0);
            if(s.studentID.length()!=6){
                return false;
            }else{
                
             if(ch!='B'){
                return false;
             }else{
                if(s.studentID.matches("B\\d{5}")){
                    return true;
                }else{
                    return false;
                }
                
             }
            
            }
            
            
        }else{
            return false;
        }
        
        

    }
}





