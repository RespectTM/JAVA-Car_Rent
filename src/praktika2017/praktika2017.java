/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktika2017;
/**
 *
 * @author RespectTM
 */
public class praktika2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mainpage log = new mainpage();
        log.setVisible(true);
    }
    
    public string regNum
            {
                get
                        {
                            return _regNum;
                        }
                        {
                            set
                                    {
                                        if (value != null)
                                            _registrationNumber = value;
                                        else
                                            Throw new Exception ("Can't be null");
                                    }
                        }
            }
    
}
