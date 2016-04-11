/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import request.RequestHttp;

/**
 *
 * @author samuelson
 */
public class RequestPOST {
    
    public static void main(String[] args) {
        try {
            RequestHttp http = new RequestHttp("http://localhost/yourFile.php");
            http.setParameters("id=1");
            http.post();
        } catch (Exception ex) {
            System.out.println("Error: "+ex);
        }
    }
    
}
