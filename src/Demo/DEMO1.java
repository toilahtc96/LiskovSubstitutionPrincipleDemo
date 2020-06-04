/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import Entity.NationalSocialActivityInterface;
import Entity.NormalStudent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author os_conght
 */
public class DEMO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        List<NationalSocialActivityInterface> allStudentsRunForSecretary = new ArrayList<NationalSocialActivityInterface>();
        allStudentsRunForSecretary.add(new NormalStudent());

//Dòng này sẽ báo lỗi biên dịch ngay lập tức
//        allStudentsRunForSecretary.add(new ForeignStudent());
// ...
//Run for Secretary
        for (NationalSocialActivityInterface student : allStudentsRunForSecretary) {
            student.runForSecretary();
        }

//{
//   Student.runForSecretary();
//        }
    }

}
