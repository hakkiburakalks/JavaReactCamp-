import React from 'react'
import candidateService from '../Services/candidateService'
import { Icon, Label, Menu, Table } from 'semantic-ui-react'
import { useState,useEffect } from 'react'
export default function CandidateList() {

  const [candidates, setCandidates] = useState([])
  useEffect(()=>{
      let candidateservice = new candidateService()
      candidateservice.getCandidates().then(result=>setCandidates(result.data.data))},[])
  
    return (
        <div>
            <Table celled className="tableclass">
    <Table.Header>
      <Table.Row>
        <Table.HeaderCell>birthDate</Table.HeaderCell>
        <Table.HeaderCell>E-Mail</Table.HeaderCell>
        <Table.HeaderCell>First Name</Table.HeaderCell>
        <Table.HeaderCell>Last Name</Table.HeaderCell>
        <Table.HeaderCell>identificationNumber</Table.HeaderCell>
       
        <Table.HeaderCell>password</Table.HeaderCell>
      </Table.Row>
    </Table.Header>

    <Table.Body>
    {candidates.map((candidate)=>(
      <Table.Row>
         
        <Table.Cell>{candidate.birthDate}</Table.Cell>
        <Table.Cell>{candidate.emailAdress}</Table.Cell>
        <Table.Cell>{candidate.firstName}</Table.Cell>
        <Table.Cell>{candidate.lastName}</Table.Cell>
        <Table.Cell>{candidate.identificationNumber}</Table.Cell>
        <Table.Cell>{candidate.password}</Table.Cell>
       
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
