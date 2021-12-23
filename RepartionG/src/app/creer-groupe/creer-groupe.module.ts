import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { CreerGroupePageRoutingModule } from './creer-groupe-routing.module';

import { CreerGroupePage } from './creer-groupe.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    CreerGroupePageRoutingModule
  ],
  declarations: [CreerGroupePage]
})
export class CreerGroupePageModule {}
