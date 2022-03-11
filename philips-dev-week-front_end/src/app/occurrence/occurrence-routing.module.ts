import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { OccurrenceComponent } from './occurrence/occurrence.component';

const routes: Routes = [
  {
    path: '', component: OccurrenceComponent 
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class OccurrenceRoutingModule { }
