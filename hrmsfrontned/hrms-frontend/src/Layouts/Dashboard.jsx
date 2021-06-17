import React from 'react'
import { Grid} from 'semantic-ui-react'
import SideBar from './SideBar'
import CandidateList from '../Pages/CandidateList'
import EmployerList from '../Pages/EmployerList'
export default function Dashboard() {
    return (
        <div>
           <Grid>
               <Grid.Row>
<Grid.Column width={4}>
<SideBar></SideBar>
</Grid.Column>
<Grid.Column width={7}>
<CandidateList></CandidateList>
</Grid.Column>
<Grid.Column width={2}>
<EmployerList></EmployerList>
</Grid.Column>




 </Grid.Row>
 </Grid>
        </div>
    )
}
