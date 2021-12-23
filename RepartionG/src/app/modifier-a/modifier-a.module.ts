import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import { ModifierAPageRoutingModule } from './modifier-a-routing.module';

import { ModifierAPage } from './modifier-a.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    ModifierAPageRoutingModule
  ],
  declarations: [ModifierAPage]
})
export class ModifierAPageModule {}
