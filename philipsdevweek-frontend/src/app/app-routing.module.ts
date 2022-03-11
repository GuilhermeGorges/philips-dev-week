import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path:'', pathMatch:'full', redirectTo:'occurrence'
  },
  {
    path: 'occurrence', 
    loadChildren: () => import('./occurrence/occurrence.module').then(m => m.OccurrenceModule) 
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
