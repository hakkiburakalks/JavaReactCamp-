import React from 'react'
import { Button,Container, Menu } from 'semantic-ui-react'
import Profile from './Profile'
export default function Navi() {
    
    return (
        <div>
            <Menu size='large' inverted fixed="top">
            <Container>
        <Menu.Item
          name='home'
/>
        <Menu.Item
          name='messages'   />



        <Menu.Menu position='right'>
         <Profile></Profile>

          <Menu.Item>
            <Button primary>Sign Up</Button>
            <Button secondary>Sign in</Button>
          </Menu.Item>
        </Menu.Menu>
        </Container>
      </Menu>


        </div>
    )
}
