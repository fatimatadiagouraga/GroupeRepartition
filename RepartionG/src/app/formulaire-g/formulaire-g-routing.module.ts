import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { FormulaireGPage } from './formulaire-g.page';

const routes: Routes = [
  {
    path: '',
    component: FormulaireGPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class FormulaireGPageRoutingModule {}
