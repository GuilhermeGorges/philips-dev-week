import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {MatSortModule} from '@angular/material/sort';
import {MatCardModule} from '@angular/material/card';

import { OccurrenceRoutingModule } from './exams-routing.module';
import { OccurrenceComponent } from './occurrence/occurrence.component';


@NgModule({
  declarations: [
    OccurrenceComponent
  ],
  imports: [
    CommonModule,
    MatSortModule,
    MatCardModule,
    OccurrenceRoutingModule
  ]
})
export class OccurrenceModule { }
