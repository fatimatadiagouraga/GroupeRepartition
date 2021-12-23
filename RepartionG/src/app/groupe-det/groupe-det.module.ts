import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { GroupeDetPageRoutingModule } from './groupe-det-routing.module';

import { GroupeDetPage } from './groupe-det.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    GroupeDetPageRoutingModule
  ],
  declarations: [GroupeDetPage]
})
export class GroupeDetPageModule {}
