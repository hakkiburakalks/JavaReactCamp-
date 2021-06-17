import React from 'react'
import axios from 'axios'
export default class employerService{
    getEmployer(){
        return axios.get("http://localhost:8080/api/employers/getall")
    }
}
