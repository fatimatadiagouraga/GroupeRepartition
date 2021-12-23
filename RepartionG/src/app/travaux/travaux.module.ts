import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { TravauxPageRoutingModule } from './travaux-routing.module';

import { TravauxPage } from './travaux.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    TravauxPageRoutingModule
  ],
  declarations: [TravauxPage]
})
export class TravauxPageModule {}
