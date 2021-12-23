import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { CreerTravPageRoutingModule } from './creer-trav-routing.module';

import { CreerTravPage } from './creer-trav.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    CreerTravPageRoutingModule
  ],
  declarations: [CreerTravPage]
})
export class CreerTravPageModule {}
