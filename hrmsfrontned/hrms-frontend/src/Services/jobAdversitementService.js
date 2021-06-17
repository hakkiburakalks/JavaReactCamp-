import axios from 'axios'
export default class jobAdversitementService{
   
    getJobAdversitementService(){
        return axios.get("http://localhost:8080/api/jobAdvertisements/findAll ")
    } 
 
    
}