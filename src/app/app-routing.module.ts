import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ClientsComponent} from './clients/clients.component';
import {ModClientComponent} from './mod-client/mod-client.component';

const routes: Routes = [
{
 path:"Clients",component:ClientsComponent
},
{
 path:"mod_client",component:ModClientComponent
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
