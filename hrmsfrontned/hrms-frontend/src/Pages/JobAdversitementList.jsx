import React from 'react'
import jobAdversitementService from '../Services/jobAdversitementService'
import { Icon, Label, Menu, Table } from 'semantic-ui-react'
import { useState,useEffect } from 'react'
export default function CandidateList() {

  const [jobadversitement, setJobadversitement] = useState([])
  useEffect(()=>{
      let jobadversitementService = new jobAdversitementService()
      jobadversitementService.getJobAdversitementService().then(result=>setJobadversitement(result.data.data))},[])
  
    return (
        <div>
            <Table celled className="tableclass">
    <Table.Header>
      <Table.Row>
        <Table.HeaderCell>Company Name</Table.HeaderCell>
        <Table.HeaderCell>e-Mail</Table.HeaderCell>
      
       
        <Table.HeaderCell>password</Table.HeaderCell>
      </Table.Row>
    </Table.Header>

    <Table.Body>
    {employer.map((employer)=>(
      <Table.Row>
         
        <Table.Cell>{employer.companyName}</Table.Cell>
        <Table.Cell>{employer.emailAdress}</Table.Cell>
       
      </Table.Row>
          ))}
    </Table.Body>

    <Table.Footer>
      <Table.Row>
        <Table.HeaderCell colSpan='3'>
          <Menu floated='right' pagination>
            <Menu.Item as='a' icon>
              <Icon name='chevron left' />
            </Menu.Item>
            <Menu.Item as='a'>1</Menu.Item>
            <Menu.Item as='a'>2</Menu.Item>
            <Menu.Item as='a'>3</Menu.Item>
            <Menu.Item as='a'>4</Menu.Item>
            <Menu.Item as='a' icon>
              <Icon name='chevron right' />
            </Menu.Item>
          </Menu>
        </Table.HeaderCell>
      </Table.Row>
    </Table.Footer>
  </Table>




















        </div>
    )
}
