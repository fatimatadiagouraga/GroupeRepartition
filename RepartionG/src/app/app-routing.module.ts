import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'home',
    loadChildren: () => import('./home/home.module').then( m => m.HomePageModule)
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: 'groupe',
    loadChildren: () => import('./groupe/groupe.module').then( m => m.GroupePageModule)
  },
  {
    path: 'travaux',
    loadChildren: () => import('./travaux/travaux.module').then( m => m.TravauxPageModule)
  },
  {
    path: 'formulaire-g',
    loadChildren: () => import('./formulaire-g/formulaire-g.module').then( m => m.FormulaireGPageModule)
  },
  {
    path: 'creer-groupe',
    loadChildren: () => import('./creer-groupe/creer-groupe.module').then( m => m.CreerGroupePageModule)
  },
  {
    path: 'groupe-det',
    loadChildren: () => import('./groupe-det/groupe-det.module').then( m => m.GroupeDetPageModule)
  },
  {
    path: 'creer-trav',
    loadChildren: () => import('./creer-trav/creer-trav.module').then( m => m.CreerTravPageModule)
  },
  {
    path: 'travail-det',
    loadChildren: () => import('./travail-det/travail-det.module').then( m => m.TravailDetPageModule)
  },
  {
    path: 'modifier-a',
    loadChildren: () => import('./modifier-a/modifier-a.module').then( m => m.ModifierAPageModule)
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
