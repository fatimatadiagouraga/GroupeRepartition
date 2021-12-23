import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { TravailDetPageRoutingModule } from './travail-det-routing.module';

import { TravailDetPage } from './travail-det.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    TravailDetPageRoutingModule
  ],
  declarations: [TravailDetPage]
})
export class TravailDetPageModule {}
