import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MatSortModule} from '@angular/material/sort';
import {MatCardModule} from '@angular/material/card';

import { ExamsRoutingModule } from './exams-routing.module';
import { ExamsComponent } from './exams/exams.component';


@NgModule({
  declarations: [
    ExamsComponent
  ],
  imports: [
    CommonModule,
    MatSortModule,
    MatCardModule,
    ExamsRoutingModule
  ]
})
export class OccurrenceModule { }
